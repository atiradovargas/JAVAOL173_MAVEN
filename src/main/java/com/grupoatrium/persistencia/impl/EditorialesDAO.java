package com.grupoatrium.persistencia.impl;

public class EditorialesDAO {
	
	private ConnectionMgr connectionMgr;
	
	public EditorialesDAO() {
		
	}

	public ConnectionMgr getConnectionMgr() {
		return connectionMgr;
	}

	public void setConnectionMgr(ConnectionMgr connectionMgr) {
		this.connectionMgr = connectionMgr;
	}
	
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		if(null != getConnectionMgr()) {
			sb.append(connectionMgr.getDriver()).append("-").append(connectionMgr.getUrl()).append("-").append(connectionMgr.getUsuario()).append("-").append(connectionMgr.getPassword());
		}
		
		return sb.toString();
	}
	
	

}
