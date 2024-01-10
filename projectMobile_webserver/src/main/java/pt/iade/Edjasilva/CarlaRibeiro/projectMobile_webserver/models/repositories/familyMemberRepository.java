package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.FamilyMember;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;

public interface familyMemberRepository extends CrudRepository<FamilyMember, Integer> {

    Iterable<FamilyMember> findByFaName(String faName);
    FamilyMember findByFaId(int id);
    Iterable<FamilyMember> findByFaCliId(int cliId);
}
