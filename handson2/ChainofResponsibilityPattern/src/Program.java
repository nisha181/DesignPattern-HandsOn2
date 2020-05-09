public class Program {

	public static ILeaveRequestHandler getChainOfILeaveRequestHandlers() {
		ILeaveRequestHandler hr = new HR();
		ILeaveRequestHandler projectManager = new ProjectManager(hr);
		ILeaveRequestHandler supervisor = new Supervisor(projectManager);
		return supervisor;
	}

	public static void main(String[] args) {
		LeaveRequest request1 = new LeaveRequest("Miss. Nisha", 1);
		LeaveRequest request2 = new LeaveRequest("Miss. Disha", 2);
		LeaveRequest request3 = new LeaveRequest("Miss. Esha", 3);
		LeaveRequest request4 = new LeaveRequest("Miss. Tanisha", 4);
		LeaveRequest request5 = new LeaveRequest("Mr.   Saptarshi", 5);
		LeaveRequest request6 = new LeaveRequest("Mr.   Mahi", 6);
		ILeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
		handler.handleRequest(request1);
		handler.handleRequest(request2);
		handler.handleRequest(request3);
		handler.handleRequest(request4);
		handler.handleRequest(request5);
		handler.handleRequest(request6);
	}

}
