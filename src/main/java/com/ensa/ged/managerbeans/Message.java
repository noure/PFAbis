package com.ensa.ged.managerbeans;

import java.io.Serializable;

public class Message implements Serializable {  
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subject;  
    private String text;  
    private long time;  

    public Message() {  
        time = System.currentTimeMillis() + (long) (Math.random() * 10);  
    }  

    public final String getSubject() {  
        return subject;  
    }  

    public final void setSubject(String subject) {  
        this.subject = subject;  
    }  

    public final String getText() {  
        return text;  
    }  

    public final void setText(String text) {  
        this.text = text;  
    }  

    public long getTime() {  
        return time;  
    }  

    public void setTime(long time) {  
        this.time = time;  
    }  
}  
