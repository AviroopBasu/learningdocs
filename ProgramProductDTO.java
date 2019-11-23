package com.amdocs.digital.ms.loyalty.account.couchbase.dto;

import com.amdocs.digital.ms.loyalty.account.business.repository.dto.interfaces.IProgramProductDTO;

public class ProgramProductDTO implements IProgramProductDTO {
	private static final long serialVersionUID = 1L;
	private String id = null;

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductOrderRefDTO {\n");
		sb.append("  " + super.toString()).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}