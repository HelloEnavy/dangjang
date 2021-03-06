package com.dangjang.dto.response;

/**
 *  기존 회원 정보도 보내줘야지 readonly처리가능
 *1. 아이디,이름, 휴대전화 번호, 비밀번호 순으로 확인할 수 있다.
 *      변경할 수 있는 값에는 변경 버튼이 존재한다.
 *
 * 2. 변경 버튼을 통해 각각 변경할 수 있다.
 *
 * 3. 닉네임 수정 시 중복 확인이 필요하다.
 *
 * 4. 가입일자를 확인할 수 있다.
 *
 * 1. 간편 회원은 비밀번호를 변경할 수 없다.
 *
 * 2. 회원정보 수정을 클릭하면, 가입한 소셜 종류와 가입 시 선택된 값만 확인할 수 있다.
 *
 * 3. 이름, 연락처, 생일을 수정하려면 본인 인증(휴대폰 전화)이 필요하다.
 *
 * 4. 닉네임 수정 시 중복 확인이 필요하다.
 *
 * 5. 가입일자를 확인할 수 있다.
 */
public class UpdateMember {
}
