package ch.zhaw.iwi.devops.service.university;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.devops.model.user.User;
import ch.zhaw.iwi.devops.service.AbstractCrudRestService;

public class universityRestService extends AbstractCrudRestService<User, Long, universityDatabaseService> {

	@Inject
	public universityRestService(Injector injector) {
		super(injector, universityDatabaseService.class);
	}

}