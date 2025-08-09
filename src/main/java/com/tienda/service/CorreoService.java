package com.tienda.service;

import jakarta.mail.MessagingException;

/**
 *
 * @author sergi
 */
public interface CorreoService {

    public void enviarCorreoHtml(
            String para, String asunto, String contenidoHtml) throws MessagingException;
    
}
