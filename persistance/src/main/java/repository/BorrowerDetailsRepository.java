package repository;

import model.BorrowerDetails;

public class BorrowerDetailsRepository extends GenericRepository<BorrowerDetails, Long> {
    private BorrowerDetails borrower;
    @Override
    public void create(BorrowerDetails entity) {
        super.create(entity);
    }

    @Override
    public void update(BorrowerDetails entity) {
        super.update(entity);
    }

    @Override
    public void delete(BorrowerDetails entity) {
        super.delete(entity);
    }

    @Override
    public BorrowerDetails read(Long id) {
        super.read(id);
        return borrower;
    }
}
