package pack.model;

import java.util.List;

import net.rithms.riot.dto.League.LeagueEntry;

public class LeagueDto {
	private Long entries;
	private String name , tier , queue;
	private List<LeagueEntry> entrylist;
	
	public List<LeagueEntry> getEntrylist() {
		return entrylist;
	}
	public void setEntrylist(List<LeagueEntry> entrylist) {
		this.entrylist = entrylist;
	}
	public Long getEntries() {
		return entries;
	}
	public void setEntries(Long entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
}
