package ch.zhaw.iwi.devops.service.university;

import java.util.List;

import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

import ch.zhaw.iwi.devops.model.university.university;
import ch.zhaw.iwi.devops.model.university.university_;
import ch.zhaw.iwi.devops.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.devops.service.PathListEntry;

public class universityDatabaseService extends AbstractCrudDatabaseService<university, Long> {

	@Override
	public Class<university> getEntityClass() {
		return university.class;
	}

	@Override
	protected void orderBy(Root<university> root, List<Order> orderList) {
		orderList.add(getCriteriaBuilder().asc(root.get(university_.name)));
	}

	@Override
	public void createPathListEntry(university entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
		entry.getDetails().add(entity.getDescription());
	}

}
