package br.com.mk.util;

import br.com.mk.util.producers.FacesProducer;

import javax.faces.application.FacesMessage;

public class FacesUtil {

    public static void sucess(String message){
        message(FacesMessage.SEVERITY_INFO, message);
    }

    public static void warn(String message){
        message(FacesMessage.SEVERITY_WARN, message);
    }

    public static void error(String message){
        message(FacesMessage.SEVERITY_ERROR, message);
    }

    public static void fatal(String message){
        message(FacesMessage.SEVERITY_FATAL, message);
    }

    private static void message(FacesMessage.Severity level, String message){
        FacesProducer.getFacesContext().addMessage(null, getMessage(level, message));
    }

    private static FacesMessage getMessage(FacesMessage.Severity level, String message){
        return new FacesMessage(level, message, null);
    }
}
