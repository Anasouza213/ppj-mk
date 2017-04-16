package br.com.mk.util;

import br.com.mk.util.producers.FacesProducer;

import javax.faces.application.FacesMessage;

public class FacesUtil {

    public static void sucess(String message){
        FacesProducer.getFacesContext().addMessage(null, getMessage(FacesMessage.SEVERITY_INFO, message));
    }

    public static void warn(String message){
        FacesProducer.getFacesContext().addMessage(null, getMessage(FacesMessage.SEVERITY_WARN, message));
    }

    public static void error(String message){
        FacesProducer.getFacesContext().addMessage(null, getMessage(FacesMessage.SEVERITY_ERROR, message));
    }

    public static void fatal(String message){
        FacesProducer.getFacesContext().addMessage(null, getMessage(FacesMessage.SEVERITY_FATAL, message));
    }

    private static FacesMessage getMessage(FacesMessage.Severity level, String mensagem){
        return new FacesMessage(level, mensagem, null);
    }
}
