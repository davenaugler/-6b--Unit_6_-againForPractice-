package exercise.PracticingInheritance;

public class SuperUser extends User {

	private Boolean readAccess = true;
	private Boolean writeAccess = true;
	private Boolean superUser = true;

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

	@Override
	public Boolean getSuperUser() {
		return superUser;
	}

	@Override
	public void setSuperUser(Boolean superUser) {
		this.superUser = superUser;
	}
}
