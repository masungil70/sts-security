package org.kosa.hello.member;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.hello.entity.MemberVO;

@Mapper
public interface MemberMapper {

	MemberVO login(MemberVO boardVO);

}
