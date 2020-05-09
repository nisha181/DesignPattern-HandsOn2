public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public HR(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public HR() {
		super();
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		System.out.println("Leave Request Approved by HR for " + leaveRequest);
	}

}
