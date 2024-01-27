package com.mobiera.ms.mno.aircast.filter;

import com.mobiera.aircast.api.vo.UserContextVO;

public interface AuthenticationContext {

	UserContextVO getCurrentUser();
}
