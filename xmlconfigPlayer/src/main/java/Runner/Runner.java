package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Player;




public class Runner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext  context = new ClassPathXmlApplicationContext ("Constructor-arg.xml");
		
    Player playgame = (Player) context.getBean("player");
    playgame.playgame();
	}

}
 