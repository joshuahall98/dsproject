package grpc.dsproject;

import javax.swing.JOptionPane;

import grpc.dsproject.ProjectServiceGrpc.ProjectServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ProjectClient {
	
	public static void main(String[] args) {
		
		
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		ProjectServiceBlockingStub blockingStub = ProjectServiceGrpc.newBlockingStub(channel);
		
		
		double weight;
		weight = Integer.parseInt(JOptionPane.showInputDialog("Please put your weight in"));
		
		CalculateRequest request = CalculateRequest.newBuilder().setNumber1(weight).build();
		
		CalculateResponse response = blockingStub.calculate(request);
		
		System.out.println(response.getCalories());
		
	}

}
