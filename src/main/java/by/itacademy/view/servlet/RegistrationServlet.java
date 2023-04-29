package by.itacademy.view.servlet;

import by.itacademy.controller.dto.CreateUserDto;
import by.itacademy.database.entity.Gender;
import by.itacademy.database.entity.Role;
import by.itacademy.exception.ValidationException;
import by.itacademy.controller.service.UserService;
import by.itacademy.utils.JspHelper;
import by.itacademy.utils.UrlPath;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
@Slf4j
@WebServlet(UrlPath.REGISTRATION)
public class RegistrationServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("roles", Role.values());
        req.setAttribute("genders", Gender.values());
        req.getRequestDispatcher(JspHelper.getPath("registration")).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var name = req.getParameter("name");
        var userDto = CreateUserDto.builder()
                .name(req.getParameter("name"))
                .birthday(req.getParameter("birthday"))
                .email(req.getParameter("email"))
                .password(req.getParameter("password"))
                .role(req.getParameter("role"))
                .gender(req.getParameter("gender"))
                .build();

        try {
            userService.create(userDto);
            log.warn("user successfully register!");
            resp.sendRedirect("/login");
        } catch (ValidationException exception) {
            req.setAttribute("errors", exception.getErrors());
            log.warn("user fail to register {}", exception.getErrors());
            doGet(req, resp);
        }

    }
}
