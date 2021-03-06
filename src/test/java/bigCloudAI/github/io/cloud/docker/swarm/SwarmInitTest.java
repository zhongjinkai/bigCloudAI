package bigCloudAI.github.io.cloud.docker.swarm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwarmInitTest {

	@Autowired
	SwarmInit swarmInit;
	
	@Test
	public void test() {
		JSONObject s = swarmInit.init("192.168.80.200:2377").send("192.168.80.200:2375");
		System.out.println(s);
	}
}
