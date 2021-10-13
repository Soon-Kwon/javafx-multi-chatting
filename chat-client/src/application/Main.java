package application;
	
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
	
public class Main extends Application {
	
	Socket socket;
	TextArea textArea;
	
	// 클라이언트 프로그램 동작 메소드
	public void startClient(String IP, int port) {
		Thread thread = new Thread() {
			
			public void run() {
				try {
					socket = new Socket(IP, port);
					receive();
				}catch(Exception e) {
					if(!socket.isClosed()) {
						stopClient();
						System.out.println("[서버 접속 실패]");
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}
	
	// 클라이언트 프로그램 종료 메소드
	public void stopClient() {
		
	}
	
	// 서버로부터 메시지를 전달받는 메소드
	public void receive() {
		
	}
	
	// 서버로 메시지를 전송하는 메소드
	public void send(String message) {
		
	}
	
	// 실제로 프로그램을 동작시키는 메소드
	@Override
	public void start(Stage primaryStage) {
	}
	
	// 프로그램의 진입점
	public static void main(String[] args) {
		launch(args);
	}
}
