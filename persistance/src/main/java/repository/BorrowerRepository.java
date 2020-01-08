package repository;

import model.Borrower;

import java.util.List;

public class BorrowerRepository extends GenericRepository<Borrower, Long> {
    private Borrower borrower;
    @Override
    public void create(Borrower entity) {
        super.create(entity);
    }

    @Override
    public void update(Borrower entity) {
        super.update(entity);
    }

    @Override
    public void delete(Borrower entity) {
        super.delete(entity);
    }

    @Override
    public Borrower read(Long id) {
        super.read(id);
        return borrower;
    }

}
