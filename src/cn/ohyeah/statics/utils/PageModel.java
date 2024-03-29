package cn.ohyeah.statics.utils;

import java.util.List;

/**
 * 封装分页信息
 * @author chengaoying
 *
 */
public class PageModel<E> {

	//结果集
	private List<E> list;
	
	//查询记录数
	private int totalRecords;
	
	//每页多少条数据
	private int pageSize;
	
	//第几页
	private int pageNo;
	
	//总额
	private long totalPrice;
	
	
	//总用户数
	private int totalUsers;
	
	@SuppressWarnings("unused")
	private int totalPages;
	
	@SuppressWarnings("unused")
	private int prePageNo;
	
	@SuppressWarnings("unused")
	private int nexPageNo;
	
	public int getPrePageNo() {
		if (pageNo <= 1) {
			return 1;
		}
		return pageNo - 1;
	}

	public void setPrePageNo(int prePageNo) {
		this.prePageNo = prePageNo;
	}

	public int getNexPageNo() {
		if (pageNo >= getBottomPageNo()) {
			return getBottomPageNo();
		}
		return pageNo + 1;	
	}

	public void setNexPageNo(int nexPageNo) {
		this.nexPageNo = nexPageNo;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public int getTotalPages() {
		return (totalRecords + pageSize - 1) / pageSize;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * 取得首页
	 * @return
	 */
	public int getTopPageNo() {
		return 1;
	}
	
	
	/**
	 * 下一页
	 * @return
	 */
	public int getNextPageNo() {
		if (pageNo >= getBottomPageNo()) {
			return getBottomPageNo();
		}
		return pageNo + 1;	
	}
	
	/**
	 * 最后一页
	 * @return
	 */
	public int getBottomPageNo() {
		return getTotalPages();
	}
	
	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
