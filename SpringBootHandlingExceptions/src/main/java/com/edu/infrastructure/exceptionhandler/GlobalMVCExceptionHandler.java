package com.edu.infrastructure.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@ControllerAdvice
//public class GlobalExceptionHandler  {
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
public class GlobalMVCExceptionHandler extends AbstractHandlerExceptionResolver {

//    @ExceptionHandler(CustomException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ModelAndView handleCustomException(
//            final CustomException customException
////            final HttpHeaders headers,
////            final HttpStatus status,
////            final WebRequest webRequest
//    ) {
//        return new ModelAndView();
//    }

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        final ModelAndView maw = new ModelAndView();

        maw.addObject("exception", ex);
        maw.addObject("uri", request.getRequestURI());
        maw.addObject("url", request.getRequestURL());
        maw.addObject("timestamp", LocalDateTime.now());
        maw.addObject("status", 400);

        maw.setViewName("error");

        return maw;
    }
}
