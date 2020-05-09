
public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;

	public ProjectManager(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public ProjectManager() {
		super();
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 5)
			System.out.println("Leave Request Approved by Project Manager for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);

	}

}
