public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public Supervisor(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public Supervisor() {
		super();
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 3)
			System.out.println("Leave Request Approved by Superviser for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);

	}

}
