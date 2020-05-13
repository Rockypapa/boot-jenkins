package today.rocky.boot.jenkins.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import today.rocky.boot.jenkins.service.TestService;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/5/13 13:15
 */
@Service
public class TestServiceImpl implements TestService {



	@Override
	public void say() {
		System.out.println("aaa");
	}
}
