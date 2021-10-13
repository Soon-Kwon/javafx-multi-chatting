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
	
	// Ŭ���̾�Ʈ ���α׷� ���� �޼ҵ�
	public void startClient(String IP, int port) {
		Thread thread = new Thread() {
			
			public void run() {
				try {
					socket = new Socket(IP, port);
					receive();
				}catch(Exception e) {
					if(!socket.isClosed()) {
						stopClient();
						System.out.println("[���� ���� ����]");
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}
	
	// Ŭ���̾�Ʈ ���α׷� ���� �޼ҵ�
	public void stopClient() {
		
	}
	
	// �����κ��� �޽����� ���޹޴� �޼ҵ�
	public void receive() {
		
	}
	
	// ������ �޽����� �����ϴ� �޼ҵ�
	public void send(String message) {
		
	}
	
	// ������ ���α׷��� ���۽�Ű�� �޼ҵ�
	@Override
	public void start(Stage primaryStage) {
	}
	
	// ���α׷��� ������
	public static void main(String[] args) {
		launch(args);
	}
}
