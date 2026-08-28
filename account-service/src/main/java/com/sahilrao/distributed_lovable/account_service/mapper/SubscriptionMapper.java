package com.sahilrao.distributed_lovable.account_service.mapper;

import com.sahilrao.distributed_lovable.account_service.dto.subscription.SubscriptionResponse;
import com.sahilrao.distributed_lovable.account_service.entity.Plan;
import com.sahilrao.distributed_lovable.account_service.entity.Subscription;
import com.sahilrao.distributed_lovable.common_lib.dto.PlanDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanDto toPlanResponse(Plan plan);
}
