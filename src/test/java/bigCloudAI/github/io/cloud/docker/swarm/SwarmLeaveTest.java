package bigCloudAI.github.io.cloud.docker.swarm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwarmLeaveTest {

	@Autowired
	SwarmLeave swarmLeave;
	
	@Test
	public void test() {
		JSONObject s = swarmLeave.leave().send("192.168.80.200:2375");
		System.out.println(s);
	}
}
