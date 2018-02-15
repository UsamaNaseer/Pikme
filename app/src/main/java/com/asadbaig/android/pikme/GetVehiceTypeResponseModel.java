package com.asadbaig.android.pikme;

public class GetVehiceTypeResponseModel{
	private String createdAt;
	private int typeId;
	private String type;
	private Object updatedAt;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setTypeId(int typeId){
		this.typeId = typeId;
	}

	public int getTypeId(){
		return typeId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUpdatedAt(Object updatedAt){
		this.updatedAt = updatedAt;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"GetVehiceTypeResponseModel{" + 
			"createdAt = '" + createdAt + '\'' + 
			",type_id = '" + typeId + '\'' + 
			",type = '" + type + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}
