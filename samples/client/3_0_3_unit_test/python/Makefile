SETUP_OUT=*.egg-info
VENV=venv

clean:
	rm -rf $(SETUP_OUT)
	rm -rf $(VENV)
	rm -rf .tox
	rm -rf .coverage
	find . -name "*.py[oc]" -delete
	find . -name "__pycache__" -delete

test: clean
	bash ./test_python.sh