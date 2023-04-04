import pytest

if __name__ == '__main__':
    params = ["-s"]
    files = ["tests/test_class.py", "tests/test_function.py", "tests/test_method.py"]
    report = ["--html=report.html"]
    args = params + files + report
    pytest.main(args)
