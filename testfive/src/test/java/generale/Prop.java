package generale;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Prop {
	static Properties prop=new Properties();
	static String  projetcpath=System.getProperty("user.dir");

	public static void getprop() {

		try {

			InputStream input=new FileInputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			try {
				prop.load(input);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String browser=prop.getProperty("browser");
			System.out.println(browser);

			Test.browserName=browser;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setpropChrome() {
		try {
			OutputStream output=new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			prop.setProperty("browser", "chrome");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}


	}
	public static void setpropfirefox() {
		try {
			OutputStream output=new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			prop.setProperty("browser", "firefox");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setpropIE() {
		try {
			OutputStream output=new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			prop.setProperty("browser", "ie");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}


	}
	public static void choisissezVotreNavigateur(String choix) {

		if (choix=="firefox") {

			OutputStream output = null;
			try {
				output = new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop.setProperty("browser", "firefox");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		else if(choix=="chrome") {

			OutputStream output = null;
			try {
				output = new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop.setProperty("browser", "chrome");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		else if(choix=="ie") {

			OutputStream output = null;
			try {
				output = new FileOutputStream(projetcpath+"\\src\\test\\java\\generale\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop.setProperty("browser", "ie");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}}
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		setpropChrome();

	}


}


