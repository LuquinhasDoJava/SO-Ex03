package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DistroController {
	private String os() {	return System.getProperty("os.name");}

	public void exibeDistro() {
		if(os().contains("Linux")) {
			try {
				Process pr = Runtime.getRuntime().exec("cat /etc/os-release");
				InputStream is = pr.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String line = br.readLine();
				while (line != null) {
					if(line.contains("NAME")) {
						if(!line.contains("PRETTY_NAME")) {
							System.out.println(line);
						}
					}
					if(line.contains("VERSION")) {
						if(!line.contains("VERSION_ID")) {
							System.out.println(line);
						}
					}
					line = br.readLine();
				}
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}else {
			System.out.println("Este sistema operacional não é uma distribuição LINUX");
		}
	}
}
