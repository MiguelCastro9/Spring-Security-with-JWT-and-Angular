package com.api.dto;

/**
 *
 * @author Miguel Castro
 */
public class JwtDto {

    private String token;

    public JwtDto() {
    }
    
    public JwtDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
