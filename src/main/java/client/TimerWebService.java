package client;

import client.stub.timer.TimerStub;
/**
 * ./wsdl2java.sh -uri http://localhost:8080/soap-ws-axis2/services/timer?wsdl -p client.stub.timer
 */

public class TimerWebService {
	public static void main(String[] args) throws Exception{
		TimerStub stub=new TimerStub();
		TimerStub.CurrentTime currentTime=new TimerStub.CurrentTime();
		String rs=stub.currentTime(currentTime).get_return();
		System.out.println(rs);
	}
}
