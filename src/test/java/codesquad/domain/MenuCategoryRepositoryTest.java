package codesquad.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MenuCategoryRepositoryTest {
    private static Logger log = LoggerFactory.getLogger(MenuCategoryRepositoryTest.class);

    @Autowired
    private MenuCategoryRepository categoryRepository;

    @Test
    public void defualt_test() {
        MenuCategory menuCategory = new MenuCategory(1L, "최상");
        categoryRepository.save(menuCategory);
        assertThat(categoryRepository.findAll().size()).isEqualTo(1);
    }

    @Test
    public void data_structure_test(){
        MenuCategory menuCategory = new MenuCategory(1L, "최상");
        MenuCategory parent = categoryRepository.save(menuCategory);

        MenuCategory secondCategory = new MenuCategory(2L, "1단계 첫번째");
        MenuCategory thirdCategory = new MenuCategory(3L, "1단계 두번째");

        parent.addChild(secondCategory);
        parent.addChild(thirdCategory);

        MenuCategory fourthCategory = new MenuCategory(4L, "2단계 첫번째");
        thirdCategory.addChild(fourthCategory);

        categoryRepository.save(parent);

        log.info("출력 : '{}'", categoryRepository.findAll());


        assertThat(categoryRepository.findAll().size()).isEqualTo(4);
        assertThat(categoryRepository.findById(1L).get().getChildren().size()).isEqualTo(2);
    }

    @Test
    public void find_root_test(){
        MenuCategory menuCategory = new MenuCategory(1L, "최상");
        MenuCategory parent = categoryRepository.save(menuCategory);

        MenuCategory secondCategory = new MenuCategory(2L, "1단계 첫번째");
        MenuCategory thirdCategory = new MenuCategory(3L, "1단계 두번째");

        parent.addChild(secondCategory);
        parent.addChild(thirdCategory);

        MenuCategory fourthCategory = new MenuCategory(4L, "2단계 첫번째");
        thirdCategory.addChild(fourthCategory);

        categoryRepository.save(parent);

        MenuCategory rootCategory= categoryRepository.findByParent(null).get();

        assertThat(rootCategory.getChildren().size()).isEqualTo(2);
        assertThat(rootCategory.getName()).isEqualTo("최상");
    }
}