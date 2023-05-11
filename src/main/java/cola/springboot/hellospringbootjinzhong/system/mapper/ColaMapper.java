package cola.springboot.hellospringbootjinzhong.system.mapper;

import cola.springboot.hellospringbootjinzhong.system.entity.dao.Cola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaMapper extends JpaRepository<Cola,Integer> {
}
