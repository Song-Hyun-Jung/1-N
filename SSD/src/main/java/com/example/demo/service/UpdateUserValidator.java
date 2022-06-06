package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.controller.UpdateUserCommand;

@Component
public class UpdateUserValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return UpdateUserCommand.class.isAssignableFrom(clazz);
	}
	@Override
	public void validate(Object obj, Errors errors) {
		UpdateUserCommand updateUserCommand = (UpdateUserCommand)obj;
		System.out.println("validator로 넘어옴");
		
		//회원정보 수정 validate
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required", "비밀번호는 필수입니다."); //비밀번호 확인
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nickname", "required", "닉네임은 필수입니다.");//닉네임 확인
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "required", "번호는 필수입니다.");//전화번호 입력 안했을 경우
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "required", "주소는 필수입니다.");//주소 확인
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "payment", "required", "결제정보는 필수입니다.");//결제정보 확인
		
		
		//전화번호 형식 확인
		String phone = updateUserCommand.getPhone();
		if (!phone.equals("") && !phone.matches("^[0][1]\\d{1}-\\d{3,4}-\\d{4}$")) {
				errors.rejectValue("phone", "typeMismatch"); // 01x-xxx-xxxx or 01x-xxxx-xxxx인지 검증
		}
	
		
	}
}
