package client;

import client.stub.caculator.CaculatorStub;

/**
 * ./wsdl2java.sh -uri http://localhost:8080/soap-ws-axis2/services/caculator?wsdl -p client.stub.caculator
 *
 */
public class CaculatorWebService {
	public static void main(String[] args) throws Exception{
		CaculatorStub stub=new CaculatorStub();
		CaculatorStub.Sum sum=new CaculatorStub.Sum();
		sum.setA(12);
		sum.setB(23);
		int rs=stub.sum(sum).get_return();
		System.out.println(rs);
	}
}
