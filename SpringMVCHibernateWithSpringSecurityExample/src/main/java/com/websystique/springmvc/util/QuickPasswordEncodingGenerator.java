/**
 * 
 */
package com.websystique.springmvc.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author soujanya
 *
 */
public class QuickPasswordEncodingGenerator {

	public static void main(String[] args) {
        String password = "abc125";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
}
}
