package com.bean;

import java.io.Serializable;

public class Goods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8080376107611462839L;

	private Integer gid ;
	private Integer bid ;
	private Integer zid ;
	private String gzname;
	private String gyname;
	private String bname;
	private String zname;
	private String sice;
	private double prize;
	private Integer shu;
	private String biao;
	private String img;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getZid() {
		return zid;
	}
	public void setZid(Integer zid) {
		this.zid = zid;
	}
	public String getGzname() {
		return gzname;
	}
	public void setGzname(String gzname) {
		this.gzname = gzname;
	}
	public String getGyname() {
		return gyname;
	}
	public void setGyname(String gyname) {
		this.gyname = gyname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public String getSice() {
		return sice;
	}
	public void setSice(String sice) {
		this.sice = sice;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public Integer getShu() {
		return shu;
	}
	public void setShu(Integer shu) {
		this.shu = shu;
	}
	public String getBiao() {
		return biao;
	}
	public void setBiao(String biao) {
		this.biao = biao;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((biao == null) ? 0 : biao.hashCode());
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		result = prime * result + ((gid == null) ? 0 : gid.hashCode());
		result = prime * result + ((gyname == null) ? 0 : gyname.hashCode());
		result = prime * result + ((gzname == null) ? 0 : gzname.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prize);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shu == null) ? 0 : shu.hashCode());
		result = prime * result + ((sice == null) ? 0 : sice.hashCode());
		result = prime * result + ((zid == null) ? 0 : zid.hashCode());
		result = prime * result + ((zname == null) ? 0 : zname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (biao == null) {
			if (other.biao != null)
				return false;
		} else if (!biao.equals(other.biao))
			return false;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (gid == null) {
			if (other.gid != null)
				return false;
		} else if (!gid.equals(other.gid))
			return false;
		if (gyname == null) {
			if (other.gyname != null)
				return false;
		} else if (!gyname.equals(other.gyname))
			return false;
		if (gzname == null) {
			if (other.gzname != null)
				return false;
		} else if (!gzname.equals(other.gzname))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (Double.doubleToLongBits(prize) != Double.doubleToLongBits(other.prize))
			return false;
		if (shu == null) {
			if (other.shu != null)
				return false;
		} else if (!shu.equals(other.shu))
			return false;
		if (sice == null) {
			if (other.sice != null)
				return false;
		} else if (!sice.equals(other.sice))
			return false;
		if (zid == null) {
			if (other.zid != null)
				return false;
		} else if (!zid.equals(other.zid))
			return false;
		if (zname == null) {
			if (other.zname != null)
				return false;
		} else if (!zname.equals(other.zname))
			return false;
		return true;
	}
	
	
	
}
