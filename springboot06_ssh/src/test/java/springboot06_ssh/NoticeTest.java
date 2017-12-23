package springboot06_ssh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itccy.springboot.Application;
import com.itccy.springboot.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)//指定运行的类
@SpringBootTest(classes=Application.class)//指定SpringBoot启动类
public class NoticeTest {

	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void findall() {
		System.err.println(noticeService.findAll());
	}
}
