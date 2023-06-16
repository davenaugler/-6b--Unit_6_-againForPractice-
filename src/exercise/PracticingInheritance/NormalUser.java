package exercise.PracticingInheritance;

public class NormalUser extends User {

	private Boolean readAccess = true;
	private Boolean writeAccess = true;

	@Override
	public Boolean getReadAccess() {
		return readAccess;
	}

	@Override
	public void setReadAccess(Boolean readAccess) {
		this.readAccess = readAccess;
	}

	@Override
	public Boolean getWriteAccess() {
		return writeAccess;
	}

	@Override
	public void setWriteAccess(Boolean writeAccess) {
		this.writeAccess = writeAccess;
	}

}
