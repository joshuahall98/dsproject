package grpc.dsproject;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import grpc.dsproject.CalculateRequest.Operation;
import grpc.dsproject.CalculateRequest3.Operation3;
import grpc.dsproject.ProjectService2Grpc.ProjectService2BlockingStub;
import grpc.dsproject.ProjectService2Grpc.ProjectService2Stub;
import grpc.dsproject.ProjectService3Grpc.ProjectService3BlockingStub;
import grpc.dsproject.ProjectService3Grpc.ProjectService3Stub;
import grpc.dsproject.ProjectServiceGrpc.ProjectServiceBlockingStub;
import grpc.dsproject.ProjectServiceGrpc.ProjectServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MainGUIApplication {
	
	
	private static ProjectServiceBlockingStub blockingStub;
	private static ProjectService2BlockingStub blockingStub2;
	private static ProjectService3BlockingStub blockingStub3;
	
	private static ProjectServiceStub asyncStub;
	private static ProjectService2Stub asyncStub2;
	private static ProjectService3Stub asyncStub3;

	private ServiceInfo projectServiceInfo;
	
	
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextField textNumber3;
	private JTextField textNumber4;
	private JTextField textNumber5;
	private JTextArea textResponse ;
	private JTextArea textResponse2 ;
	private JTextArea textResponse3 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUIApplication window = new MainGUIApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUIApplication() {
		
		String project_service_type = "_project._tcp.local.";
		discoverProjectService(project_service_type);
		
		String project_service2_type = "_project2._tcp.local.";
		discoverProjectService2(project_service2_type);
		
		String project_service3_type = "_project3._tcp.local.";
		discoverProjectService3(project_service3_type);
		
		
		String host = projectServiceInfo.getHostAddresses()[0];
		int port = 50051;
		int port2 = 50052;
		int port3 = 50053;
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		ManagedChannel channel2 = ManagedChannelBuilder
				.forAddress(host, port2)
				.usePlaintext()
				.build();
		
		ManagedChannel channel3 = ManagedChannelBuilder
				.forAddress(host, port3)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = ProjectServiceGrpc.newBlockingStub(channel);

		asyncStub = ProjectServiceGrpc.newStub(channel);
		
		blockingStub2 = ProjectService2Grpc.newBlockingStub(channel2);

		asyncStub2 = ProjectService2Grpc.newStub(channel2);
		
		blockingStub3 = ProjectService3Grpc.newBlockingStub(channel3);

		asyncStub3 = ProjectService3Grpc.newStub(channel3);

		
		initialize();
	}

	
	
	private void discoverProjectService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Project Service resolved: " + event.getInfo());

					projectServiceInfo = event.getInfo();

					int port = 50051;
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + projectServiceInfo.getNiceTextString());
					System.out.println("\t host: " + projectServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Project Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Project Service added: " + event.getInfo());

					
				}
			});
			
			// Wait a bit
			Thread.sleep(2000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	private void discoverProjectService2(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Project Service resolved: " + event.getInfo());

					projectServiceInfo = event.getInfo();

					int port = 50052;
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + projectServiceInfo.getNiceTextString());
					System.out.println("\t host: " + projectServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Project Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Project Service added: " + event.getInfo());

					
				}
			});
			
			// Wait a bit
			Thread.sleep(2000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
private void discoverProjectService3(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Project Service resolved: " + event.getInfo());

					projectServiceInfo = event.getInfo();

					int port = 50053;
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + projectServiceInfo.getNiceTextString());
					System.out.println("\t host: " + projectServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Project Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Project Service added: " + event.getInfo());

					
				}
			});
			
			// Wait a bit
			Thread.sleep(2000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Client - Service Controller");
		frame.setBounds(100, 100, 500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Weight in kg:");
		panel_service_1.add(lblNewLabel_1);
		
		textNumber1 = new JTextField();
		panel_service_1.add(textNumber1);
		textNumber1.setColumns(10);
		
//		JLabel lblNewLabel_2 = new JLabel("Number 2");
//		panel_service_1.add(lblNewLabel_2);
//		
//		textNumber2 = new JTextField();
//		panel_service_1.add(textNumber2);
//		textNumber2.setColumns(10);
		
		
		JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"Walking", "Brisk Walking", "Jogging"}));
		panel_service_1.add(comboOperation);
	
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(textNumber1.getText());
//				int num2 = Integer.parseInt(textNumber2.getText());

				int index = comboOperation.getSelectedIndex();
				Operation operation = Operation.forNumber(index);
				
				CalculateRequest req = CalculateRequest.newBuilder().setNumber1(num1).setOperation(operation).build();

				CalculateResponse response = blockingStub.calculate(req);

				textResponse.append(response.getCaloriesmessage() + "\n");
				
				System.out.println("res: " + response.getCalories() + " mes: " + response.getCaloriesmessage());

			}
		});
		panel_service_1.add(btnCalculate);
		
		textResponse = new JTextArea(3, 20);
		textResponse.setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
		
		
		//panel 2
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Weight in kg:");
		panel_service_2.add(lblNewLabel_2);
		
		textNumber2 = new JTextField();
		panel_service_2.add(textNumber2);
		textNumber2.setColumns(10);
		
		JButton btnCalculate2 = new JButton("Calculate");
		btnCalculate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(textNumber2.getText());
//				int num2 = Integer.parseInt(textNumber2.getText());

//				int index = comboOperation.getSelectedIndex();
//				Operation operation = Operation.forNumber(index);
				
				CalculateRequest2 req = CalculateRequest2.newBuilder().setWeight(num1).build();

				CalculateResponse2 response = blockingStub2.calculate2(req);

				textResponse2.append(response.getWatermessage() + "\n");
				
				System.out.println("res: " + response.getWater() + " mes: " + response.getWatermessage());

			}
		});
		panel_service_2.add(btnCalculate2);
		
		textResponse2 = new JTextArea(3, 20);
		textResponse2 .setLineWrap(true);
		textResponse2.setWrapStyleWord(true);
		
		JScrollPane scrollPane2 = new JScrollPane(textResponse2);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_2.add(scrollPane2);
		
		
		//panel 3
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
		panel_service_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Weight in kg:");
		panel_service_3.add(lblNewLabel_3);
		
		textNumber3 = new JTextField();
		panel_service_3.add(textNumber3);
		textNumber3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Height in inches:");
		panel_service_3.add(lblNewLabel_4);
		
		textNumber4 = new JTextField();
		panel_service_3.add(textNumber4);
		textNumber4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Age:");
		panel_service_3.add(lblNewLabel_5);
		
		textNumber5 = new JTextField();
		panel_service_3.add(textNumber5);
		textNumber5.setColumns(10);
		
		JComboBox comboOperation3 = new JComboBox();
		comboOperation3.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		panel_service_3.add(comboOperation3);
	
		
		JButton btnCalculate3 = new JButton("Calculate");
		btnCalculate3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(textNumber3.getText());
				int num2 = Integer.parseInt(textNumber4.getText());
				int num3 = Integer.parseInt(textNumber5.getText());

				int index = comboOperation.getSelectedIndex();
				Operation3 operation = Operation3.forNumber(index);
				
				CalculateRequest3 req = CalculateRequest3.newBuilder().setWeight2(num1).setHeight(num2).setAge(num3).setOperation3(operation).build();

				CalculateResponse3 response = blockingStub3.calculate3(req);

				textResponse3.append(response.getCaloriesmessage3() + "\n");
				
				System.out.println("res: " + response.getCalories3() + " mes: " + response.getCaloriesmessage3());

			}
		});
		panel_service_3.add(btnCalculate3);
		
		textResponse3 = new JTextArea(3, 20);
		textResponse3 .setLineWrap(true);
		textResponse3.setWrapStyleWord(true);
		
		JScrollPane scrollPane3 = new JScrollPane(textResponse3);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_3.add(scrollPane3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
