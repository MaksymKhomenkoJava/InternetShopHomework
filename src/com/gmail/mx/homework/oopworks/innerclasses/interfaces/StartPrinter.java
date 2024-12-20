package com.gmail.mx.homework.oopworks.innerclasses.interfaces;

public class StartPrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {
            Printer emptyMessageHandler = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Processing a blank message from an anonymous user...");
                }
            };
            emptyMessageHandler.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Anonymous user sent the message: " + message.getText());
        } else {
            System.out.println("User" + message.getSender() + " sent a message: " + message.getText());
        }
    }
}

