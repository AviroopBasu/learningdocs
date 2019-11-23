package com.amdocs.digital.ms.loyalty.account.couchbase.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amdocs.digital.ms.loyalty.account.business.repository.dto.interfaces.ILoyaltyAccountDTO;
import com.amdocs.digital.ms.loyalty.account.business.repository.dto.interfaces.IProgramMemberDTO;
import com.amdocs.digital.ms.loyalty.account.business.repository.dto.interfaces.IProgramProductDTO;
import com.amdocs.msbase.persistence.couchbase.repository.dto.KeyCouchbaseDTO;
import com.amdocs.msbase.repository.key.implementation.SimpleKey;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class LoyaltyAccountDTO extends KeyCouchbaseDTO<SimpleKey>
		implements ILoyaltyAccountDTO, Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loyaltyBalance = null;
	private List<IProgramMemberDTO> loyaltyProgramMembers = new ArrayList<>();
	private List<IProgramProductDTO> loyaltyProgramProducts = new ArrayList<>();
	private Map<String, Object> extensions = new HashMap<>();
	// Control fields
	private String modelVersion;
	private String createdBy;
	private Date createdOn;
	private String lastModifiedBy;
	private Date lastModifiedOn;

	@Override
	@JsonDeserialize(as = SimpleKey.class)
	public void setKey(SimpleKey key) {
		this.key = key;
	}

	@Override
	public String getLoyaltyBalance() {
		return this.loyaltyBalance;
	}

	@Override
	public void setLoyaltyBalance(String loyaltyBalance) {
		this.loyaltyBalance = loyaltyBalance;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CheckoutDTO {\n");
		sb.append("  " + super.toString()).append("\n");
		sb.append("  key: ").append(getKey().toString()).append("\n");
		sb.append("  loyaltyBalance: ").append(loyaltyBalance).append("\n");
		sb.append("  loyaltyProgramMember: ").append(loyaltyProgramMembers).append("\n");
		sb.append("  loyaltyProgramProduct: ").append(loyaltyProgramProducts).append("\n");
		sb.append("  modelVersion: ").append(modelVersion).append("\n");
		sb.append("  createdOn: ").append(createdOn).append("\n");
		sb.append("  createdBy: ").append(createdBy).append("\n");
		sb.append("  lastModifiedOn: ").append(lastModifiedOn).append("\n");
		sb.append("  lastModifiedBy: ").append(lastModifiedBy).append("\n");
		sb.append("  optimisticLockingValue: ").append(getOptimisticLockingValue()).append("\n");
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

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IProgramProductDTO> getLoyaltyProgramProduct() {
		// TODO Auto-generated method stub
		return loyaltyProgramProducts;
	}

	@Override
	@JsonDeserialize(as = IProgramProductDTO.class)
	public void setLoyaltyProgramProduct(List<IProgramProductDTO> loyaltyProgramProduct) {
		// TODO Auto-generated method stub
		this.loyaltyProgramProducts = loyaltyProgramProduct;

	}

	@Override
	@JsonDeserialize(as = IProgramMemberDTO.class)
	public void setLoyaltyProgramMember(List<IProgramMemberDTO> loyaltyProgramMember) {
		// TODO Auto-generated method stub
		this.loyaltyProgramMembers = loyaltyProgramMember;

	}

	@Override
	public Map<String, Object> getExtensions() {
		// TODO Auto-generated method stub
		return extensions;
	}

	@Override
	public void setExtensions(Map<String, Object> extensions) {
		// TODO Auto-generated method stub
		this.extensions = extensions;

	}

	@Override
	public List<IProgramMemberDTO> getLoyaltyProgramMember() {
		// TODO Auto-generated method stub
		return loyaltyProgramMembers;
	}
}