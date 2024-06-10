package org.example.model;

public class EmailService {
    public void sendEmail(String email, String subject, String message) {
        System.out.println("Enviando correo a " + email + ". Asunto: '" + subject + "'.\nMensaje: '" + message + "'");
    }
}
