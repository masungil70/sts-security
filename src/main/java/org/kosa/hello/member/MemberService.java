package org.kosa.hello.member;

import org.kosa.hello.entity.BoardVO;
import org.kosa.hello.entity.MemberVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * MVC 
 * Model : B/L 로직을 구현하는 부분(service + dao)  
 * View  : 출력(jsp) 
 * Controller : model와 view에 대한 제어를 담당 
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
      
	private final MemberMapper  memberMapper;

//	public MemberVO login(MemberVO memberVO)  {
//		//view Count의 값이 증가된 객체를 얻는다
//		MemberVO resultVO = memberMapper.login(memberVO);
//		if (resultVO != null && memberVO.isEqualsPwd(resultVO.getMember_pwd())) {
//			return resultVO;
//		}
//		return null;
//	}

	public static void main(String [] args) {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bcryptPasswordEncoder.encode("1004"));
		System.out.println(bcryptPasswordEncoder.encode("0123456789010234567890123456789"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MemberVO resultVO = memberMapper.login(MemberVO.builder().member_id(username).build());
		
		return null;
	}
}











