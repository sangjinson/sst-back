package sst.customersupport.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import sst.customersupport.domain.CustomerSupport;
import sst.customersupport.mapper.CustomerSupportMapper;

@Service
@RequiredArgsConstructor
public class AdminCustomerSupportServiceImpl implements AdminCustomerSupportService {

    private final CustomerSupportMapper customerSupportMapper;

    @Override
    public int createNotice(CustomerSupport customerSupport) {
        return customerSupportMapper.insertNotice(customerSupport);
    }

    @Override
    public int updateNotice(CustomerSupport customerSupport) {
        return customerSupportMapper.updateNotice(customerSupport);
    }

    @Override
    public int deleteNotice(Long csNo) {
        return customerSupportMapper.deleteNotice(csNo);
    }

    @Override
    public int createFaq(CustomerSupport customerSupport) {
        return customerSupportMapper.insertFaq(customerSupport);
    }

    @Override
    public int updateFaq(CustomerSupport customerSupport) {
        return customerSupportMapper.updateFaq(customerSupport);
    }

    @Override
    public int deleteFaq(Long csNo) {
        return customerSupportMapper.deleteFaq(csNo);
    }
}