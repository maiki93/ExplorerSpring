package net.ddns.kimai.ExplorerSpring;

//import org.apache.logging.log4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplorerSpringApplication  implements CommandLineRunner {

	//private static Logger LOG = LoggerFactory.getLogger(ExplorerSpringApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExplorerSpringApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bonne chance aux aventuriers");
		
		
		System.out.println("Relancez moi pour trouver encore plus de trésors");	
	}

		

		
}
