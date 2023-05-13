package cola.springboot.hellospringbootjinzhong.system.pojo.dao;

import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Cola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaDao extends JpaRepository<Cola,Integer> {
}
